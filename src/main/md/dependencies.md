# Introduction

This document describes the dependencies required to build this repository.
Instructions are given for __Ubuntu 14.04 LTS__ and dependencies for other distributions may vary.

If you are doing a fresh clone, remember to include `--recursive` in your git clone command.

```
git clone git@github.com:ghorbanzade/UMB-CS114-2015F.git --recursive
```

You can also make sure that you have the required submodules by running the following command.

```
git submodule update --init --recursive
```
# Building Java Codes

You can build java programs by issuing `make` (or `make code`) in the top-level directory.
The package(s) needed for building java codes are listed below.

```
sudo apt-get install ant
sudo apt-get install openjdk-7-jdk
```

# Building Documents

You can build all java documents (as well as all java source codes) by issuing `make docs` in the top-level directory.
The following packages are needed to successfully build all documents.

```
sudo apt-get install texlive-latex-base
sudo apt-get install texlive-latex-extra
sudo apt-get install texlive-xetex
sudo apt-get install texlive-fonts-recommended
sudo apt-get install python-pygments
```

Please send [me](mailto:mail@ghorbanzade.com) a note in case you found a dependency not listed here.

