BIN_DIR = build/distributions
SRC_DIR = src
TEX_DIR = $(SRC_DIR)/main/tex
DOC_DIR = $(BIN_DIR)/doc

DOCS = \
syllabus/syllabus \
hw01/hw01 hw01/hw01s hw02/hw02 hw02/hw02s hw03/hw03 hw03/hw03s \
hw04/hw04 hw04/hw04s hw05/hw05 hw05/hw05s \
m01/m01 m01/m01s m02/m02 m02/m02s f01/f01 f01/f01s f02/f02 f02/f02s \
ls01/ls01 ls02/ls02 ls03/ls03 ls04/ls04 ls05/ls05 ls06/ls06 \
ls07/ls07 ls08/ls08 ls09/ls09 ls10/ls10 ls11/ls11 ls12/ls12 \
ls13/ls13 ls14/ls14

DOC_SRC = $(foreach NUM, $(DOCS), $(TEX_DIR)/$(NUM).tex)
DOC_DST = $(foreach NUM, $(DOC_SRC), $(DOC_DIR)/$(NUM:$(TEX_DIR)/%.tex=%.pdf))

.PHONY: dirs code docs publish clean

all: dirs code docs

dirs:
	@mkdir -p $(BIN_DIR)
	@mkdir -p $(DOC_DIR)

build: syllabus assignments exams slides binder tidy

syllabus: directories $(SYLLABUS_PDF)

$(SYLLABUS_PDF): $(SYLLABUS_TEX)
	@echo -n "  $(@F)... " && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(SYLLABUS_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(SYLLABUS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

assignments: directories $(ASSIGNMENTS_PDF)

$(ASSIGNMENTS_PDF): $(ASSIGNMENTS_TEX)
	@echo -n "  $(@F)... " && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(ASSIGNMENTS_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(ASSIGNMENTS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

exams: directories $(EXAMS_PDF)

$(EXAMS_PDF): $(EXAMS_TEX)
	@echo -n "  $(@F)... " && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(EXAMS_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error -output-directory $(DOC_DIR) $(EXAMS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

slides: directories prepare $(SLIDES_PDF)

prepare:
	@rm -rf "$(FONT_DIR)"
	@echo -n "  Extracting fonts... "
	@mkdir -p $(FONT_DIR)
	@tar -zxf $(FONT_DIR).tar.gz -C $(FONT_DIR) --strip-component=1
	@echo "Done."

$(SLIDES_PDF): $(SLIDES_TEX)
	@echo -n "  $(@F)... "
	@cd $(DOC_DIR) && \
	xelatex -halt-on-error -shell-escape ../../$(SLIDES_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	xelatex -halt-on-error -shell-escape ../../$(SLIDES_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

binder:
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=$(BIN_DIR)/course-material.pdf $(ALL_PDF)
	@echo "Done."

code:
	@ant;

docs: dirs $(DOC_DST)
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite \
		-sOutputFile=$(BIN_DIR)/cs240.pdf \
		$(foreach NUM, $(DOC_DST), $(DOC_DIR)/$(notdir $(NUM)))
	@echo "OK"

$(DOC_DST): $(DOC_SRC)
	@echo -n "  Building $(@F)... "
	@pdflatex -halt-on-error -output-directory $(DOC_DIR) \
		-shell-escape $(@:$(DOC_DIR)/%.pdf=$(TEX_DIR)/%.tex) > /dev/null
	@pdflatex -halt-on-error -output-directory $(DOC_DIR) \
		-shell-escape $(@:$(DOC_DIR)/%.pdf=$(TEX_DIR)/%.tex) > /dev/null
	@rm -rf $(DOC_DIR)/$(@F:.pdf=).aux
	@rm -rf $(DOC_DIR)/$(@F:.pdf=).log
	@rm -rf $(DOC_DIR)/$(@F:.pdf=).nav
	@rm -rf $(DOC_DIR)/$(@F:.pdf=).out
	@rm -rf $(DOC_DIR)/$(@F:.pdf=).snm
	@rm -rf $(DOC_DIR)/$(@F:.pdf=).toc
	@rm -rf $(DOC_DIR)/$(@F:.pdf=).vrb
	@rm -rf _minted-$(patsubst %.pdf,%, $(@F:.pdf=))
	@echo "OK"

publish: all
	@echo -n "  Uploading to Remote... " && \
	./upload_files.sh
	@echo "OK"

clean:
	@echo -n "  Removing binaries... "
	@ant clean
	@rm -rf $(BIN_DIR)
	@echo "OK"
