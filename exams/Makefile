TOP_DIR = ..

EXAMS = m01 m02
SOLUTIONS = m01 m02
FILES = $(foreach NUM, $(EXAMS), $(NUM)/exam/$(NUM))
FILES += $(foreach NUM, $(SOLUTIONS), $(NUM)/solution/$(NUM)s)

PDF = $(addsuffix .pdf, $(FILES))
TEX = $(addsuffix .tex, $(FILES))

.PHONY: clean code docs all

all: code ;

docs: code $(PDF)
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=$(TOP_DIR)/exams.pdf $(PDF)
	@echo "Done."

$(PDF): $(TEX)
	@echo -n "  $(@D)... "
	@cd $(@D) && \
	pdflatex -halt-on-error $(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error $(@F:.pdf=.tex) > /dev/null
	@echo "Done."

code: ;

clean:
	@find . -name '*.log' -delete
	@find . -name '*.aux' -delete
	@find . -name '*.pdf' -delete
	@find . -name '*.out' -delete
	@find . -name '*.class' -delete
	@rm -f $(BIND_DIR)/exams.pdf
