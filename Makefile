TOP_DIR = .
BIN_DIR = $(TOP_DIR)/bin
SRC_DIR = $(TOP_DIR)/src

DOCS = syllabus assignments exams slides
PDF_TARGET = course-material.pdf
PDF = $(addsuffix .pdf, $(DOCS))

.PHONY: clean code docs assignment exams slides syllabus all
all: code

docs: code $(PDF_TARGET)
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=course-material.pdf $(PDF)
	@echo "Done."
	@rm -f $(PDF)

$(PDF_TARGET): syllabus assignment exams slides

syllabus: $(BIN_DIR)/syllabus.pdf

$(BIN_DIR)/syllabus.pdf: $(SRC_DIR)/main/tex/syllabus/syllabus.tex
	@mkdir -p $(BIN_DIR)
	@echo -n "  $(@F)... " && \
	pdflatex -halt-on-error -output-directory $(BIN_DIR) $(SRC_DIR)/main/tex/syllabus/syllabus.tex > /dev/null && \
	pdflatex -halt-on-error -output-directory $(BIN_DIR) $(SRC_DIR)/main/tex/syllabus/syllabus.tex > /dev/null
	@echo "Done."
	@cp $(BIN_DIR)/syllabus.pdf $(TOP_DIR)/syllabus.pdf

assignment:
	@$(MAKE) --no-print-directory docs -C assignments;

exams:
	@$(MAKE) --no-print-directory docs -C exams;

slides:
	@$(MAKE) --no-print-directory docs -C slides;

code:
	@ant;

clean:
	@ant clean;
	@$(MAKE) --no-print-directory clean -C assignments;
	@$(MAKE) --no-print-directory clean -C exams;
	@$(MAKE) --no-print-directory clean -C slides;
	@rm -f $(PDF) $(PDF_TARGET)
	@rm -rf $(BIN_DIR)
