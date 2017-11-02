# databindingissue

Multi-module projects using gradle "implementation" command cannot see databinding classes at runtime.

This sample project has a module A which is used by the module B which is in turn used by the app module. 
All with gradle's `implementation` command so the app module doesn't know about module A. All modules also have data binding enabled in their respective gradle config.

When you run the app, it will crash with the following error message:

```
java.lang.NoClassDefFoundError: Failed resolution of: Lcom/riclage/librarya/databinding/ActivityFromModuleABinding;
     at com.riclage.libraryb.LibraryBActivity.onCreate(LibraryBActivity.java:14)
     at android.app.Activity.performCreate(Activity.java:6975)
     ...
  Caused by: java.lang.ClassNotFoundException: Didn't find class "com.riclage.librarya.databinding.ActivityFromModuleABinding" on path: DexPathList[[zip file "/data/app/com.riclage.databindingimplementationissue-J_Bpj-dF8Vvaj80R3PUyOg==/base.apk"],nativeLibraryDirectories=[/data/app/com.riclage.databindingimplementationissue-J_Bpj-dF8Vvaj80R3PUyOg==/lib/arm64, /system/lib64, /vendor/lib64]]
     ...
```
