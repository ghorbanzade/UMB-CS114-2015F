TOP_DIR = .
BIN_DIR = $(TOP_DIR)/bin
SRC_DIR = $(TOP_DIR)/src
TEX_DIR = $(SRC_DIR)/main/tex
FONT_DIR= $(TEX_DIR)/template/fonts
DOC_DIR = $(BIN_DIR)/doc
SYLLABUS_DIR = $(TEX_DIR)/syllabus
ASSIGNMENTS_DIR = $(TEX_DIR)/assignments
EXAMS_DIR = $(TEX_DIR)/exams
SLIDES_DIR = $(TEX_DIR)/slides

SYLLABUS = syllabus
ASSIGNMENTS = hw01 hw01s hw02 hw02s hw03 hw03s hw04 hw04s hw05 hw05s
EXAMS = m01 m01s m02 m02s f01 f01s f02 f02s
SLIDES = ls01 ls02 ls03 ls04 ls05 ls06 ls07 ls08 ls09 ls10 ls11 ls12 ls13 ls14

ALL_DOC = $(SYLLABUS) $(ASSIGNMENTS) $(EXAMS) $(SLIDES)
ALL_PDF = $(foreach NUM, $(ALL_DOC), $(DOC_DIR)/$(NUM).pdf)

SYLLABUS_TEX = $(foreach NUM, $(SYLLABUS), $(SYLLABUS_DIR)/$(NUM).tex)
SYLLABUS_PDF = $(foreach NUM, $(SYLLABUS), $(DOC_DIR)/$(NUM).pdf)
ASSIGNMENTS_TEX = $(foreach NUM, $(ASSIGNMENTS), $(ASSIGNMENTS_DIR)/$(NUM).tex)
ASSIGNMENTS_PDF = $(foreach NUM, $(ASSIGNMENTS), $(DOC_DIR)/$(NUM).pdf)
EXAMS_TEX = $(foreach NUM, $(EXAMS), $(EXAMS_DIR)/$(NUM).tex)
EXAMS_PDF = $(foreach NUM, $(EXAMS), $(DOC_DIR)/$(NUM).pdf)
SLIDES_TEX = $(foreach NUM, $(SLIDES), $(SLIDES_DIR)/$(NUM).tex)
SLIDES_PDF = $(foreach NUM, $(SLIDES), $(DOC_DIR)/$(NUM).pdf)

.PHONY: clean code docs syllabus assignments exams slides bind tidy all

all: directories code docs

directories:
	@mkdir -p $(BIN_DIR)
	@mkdir -p $(DOC_DIR)

docs: syllabus assignments exams slides binder tidy

syllabus: directories $(SYLLABUS_PDF)

$(SYLLABUS_PDF): $(SYLLABUS_TEX)
	@printf "  $(@F)... "
	@pdflatex -halt-on-error -output-directory $(DOC_DIR) \
						$(SYLLABUS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@pdflatex -halt-on-error -output-directory $(DOC_DIR) \
						$(SYLLABUS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

assignments: directories $(ASSIGNMENTS_PDF)

$(ASSIGNMENTS_PDF): $(ASSIGNMENTS_TEX)
	@printf "  $(@F)... "
	@pdflatex -halt-on-error -output-directory $(DOC_DIR) \
						$(ASSIGNMENTS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@pdflatex -halt-on-error -output-directory $(DOC_DIR) \
						$(ASSIGNMENTS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

exams: directories $(EXAMS_PDF)

$(EXAMS_PDF): $(EXAMS_TEX)
	@printf "  $(@F)... "
	@pdflatex -halt-on-error -output-directory $(DOC_DIR) \
						$(EXAMS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@pdflatex -halt-on-error -output-directory $(DOC_DIR) \
						$(EXAMS_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

slides: directories prepare $(SLIDES_PDF)

prepare:
	@rm -rf "$(FONT_DIR)"
	@printf "  Extracting fonts... "
	@mkdir -p $(FONT_DIR)
	@tar -zxf $(FONT_DIR).tar.gz -C $(FONT_DIR) --strip-component=1
	@echo "Done."

$(SLIDES_PDF): $(SLIDES_TEX)
	@printf "  $(@F)... "
	@cd $(DOC_DIR) && \
	xelatex -halt-on-error -shell-escape ../../$(SLIDES_DIR)/$(@F:.pdf=.tex) > /dev/null && \
	xelatex -halt-on-error -shell-escape ../../$(SLIDES_DIR)/$(@F:.pdf=.tex) > /dev/null
	@echo "Done."

binder:
	@printf "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite \
			-sOutputFile=$(DOC_DIR)/cs114.pdf $(ALL_PDF)
	@echo "Done."

code:
	@ant;

tidy:
	@rm -rf $(FONT_DIR)
	@find $(BIN_DIR) -name '*.log' -delete
	@find $(BIN_DIR) -name '*.aux' -delete
	@find $(BIN_DIR) -name '*.out' -delete
	@find $(BIN_DIR) -name '*.vrb' -delete
	@find $(BIN_DIR) -name '*.snm' -delete
	@find $(BIN_DIR) -name '*.toc' -delete
	@find $(BIN_DIR) -name '*.nav' -delete
	@find $(BIN_DIR) -name '*.pyg' -delete

clean:
	@ant clean
	@rm -rf $(BIN_DIR)
