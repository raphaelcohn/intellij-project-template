# intellij-project-template

intellij-project-template provides a simple set of defaults for an [IntelliJ IDEA] project that suit my way of working. They're designed to be integrated as a git submodule in the top level of your project's root:-

	mkdir -m 0755 -p .idea-local/copyright .idea-local/runConfigurations .idea-local/libraries
	mkdir -m 0755 libraries
    git submodule add https://github.com/raphaelcohn/intellij-project-template.git .idea

Think of it as a 'dotfiles' project.


## Usage Hints

If you haven't already done so, you'll need to ignore the project output:-

	printf '%s\n' 'out/' >> .gitignore

I strongly suggest you copy the contents a `.idea-local` from an existing project, eg [java-classfile]. Alternatively, create the following files inside `.idea-local`:-

	.name
	misc.xml
	modules.xml
	vcs.xml
	copyright/*
	dictionaries/*

`.name` is just the name of your project _without_ a trailing line feed. Typically this is just your GitHub repository name.

Optionally, create also:-

	runConfigurations/*

To add libraries into `.idea-local/libraries/`, you'll need to create `*.xml` files in `.idea-local/libraries/`. The easiest way to do this is to follow the instructions for already created libraries which can be installed as submodules:-

* For `annotations`, use [intelli-library-annotations]: https://github.com/raphaelcohn/intellij-library-annotations
* For `jopt-simple`, use [intellij-library-jopt-simple]: https://github.com/raphaelcohn/intellij-library-jopt-simple

Alternatively, you can just add libraries as normal using [IntellIJ IDEA] and everything will end up in source control.


## Changing my settings if you don't like 'em

Easy. Just fork this repository and change what you want. To misquote a fast food giant, "your `.idea-local`, your way".


## Licensing

The license for this project is MIT.


[IntelliJ IDEA]: https://www.jetbrains.com/idea/ "IntelliJ IDEA home page"
[java-classfile]: https://github.com/raphaelcohn/java-classfile "java-classfile GitHub page"
