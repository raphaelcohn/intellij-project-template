# intellij-project-template

[intellij-project-template] provides a simple set of defaults for an IntelliJ module that suit my way of working. They're designed to be integrated as a git submodule in the top level of your java project:-

	mkdir -m 0755 -p .idea-local/copyright .idea-local/runConfigurations
	mkdir -m 0755 libraries
    git submodule add https://github.com/raphaelcohn/intellij-project-template.git .idea

I strongly suggest you copy a `.idea-local` from an existing project, eg [java-classfile].


## Licensing

The license for this project is MIT.


[intellij-project-template]: https://github.com/raphaelcohn/intellij-project-template "intellij-project-template GitHub page"
[java-classfile]: https://github.com/raphaelcohn/java-classfile "java-classfile GitHub page"
