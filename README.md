# databindingissue

Multi-module projects using gradle "implementation" command cannot see databinding classes at runtime.

This sample project has a module A which is used by the module B which is in turn used by the app module. 
All with gradle's `implementation` command so the app module doesn't know about module A. 

What is happening is that the generated `DataBinderMapper` class does not generate the mapper for the layout in module A. When you run the app, it will crash with the following error message:

```
java.lang.NoClassDefFoundError: Failed resolution of: Lcom/riclage/librarya/databinding/ActivityFromModuleABinding;
     at com.riclage.libraryb.LibraryBActivity.onCreate(LibraryBActivity.java:14)
```
