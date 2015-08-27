TOP_DIR = ..

ASSIGNMENTS =
SOLUTIONS =
FILES = $(foreach NUM, $(ASSIGNMENTS), hw0$(NUM)/assignment/hw0$(NUM))
FILES += $(foreach NUM, $(SOLUTIONS), hw0$(NUM)/solution/hw0$(NUM)s)

CODE_1 = 
CODE_2 =
CODE_3 =
CODE_4 =
CODE_5 =
CODE_6 =
CODES  = $(foreach FILE, $(CODE_1), hw01/code/$(FILE))
CODES += $(foreach FILE, $(CODE_2), hw02/code/$(FILE))
CODES += $(foreach FILE, $(CODE_3), hw03/code/$(FILE))
CODES += $(foreach FILE, $(CODE_4), hw04/code/$(FILE))
CODES += $(foreach FILE, $(CODE_5), hw05/code/$(FILE))
CODES += $(foreach FILE, $(CODE_6), hw06/code/$(FILE))

PDF = $(addsuffix .pdf, $(FILES))
TEX = $(addsuffix .tex, $(FILES))
CLASS = $(addsuffix .class, $(CODES))
JAVA = $(addsuffix .java, $(CODES))

.PHONY: clean code docs all

all: code ;

docs: code $(PDF)
	@echo -n "  Binding documents... "
	@gs -dBATCH -dNOPAUSE -q -sDEVICE=pdfwrite -sOutputFile=$(TOP_DIR)/assignments.pdf $(PDF)
	@echo "Done."

$(PDF): $(TEX)
	@echo -n "  $(@D)... "
	@cd $(@D) && \
	pdflatex -halt-on-error $(@F:.pdf=.tex) > /dev/null && \
	pdflatex -halt-on-error $(@F:.pdf=.tex) > /dev/null
	@echo "Done."

code: $(CLASS)
$(CLASS): $(JAVA)
	@echo -n "  $(@:.class=)... "
	@cd $(@D) && \
	javac -d . -classpath . $(@F:.class=.java)
	@echo "Done."

clean:
	@find . -name '*.log' -delete
	@find . -name '*.aux' -delete
	@find . -name '*.pdf' -delete
	@find . -name '*.out' -delete
	@find . -name '*.class' -delete
	@rm -f $(BIND_DIR)/exams.pdf
