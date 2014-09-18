//var list = File.dir("/script");

var test=1234;

/*
 * The package ABC is available because:
 * 1. the file plugin.properties exists and tell where are the java / javascript files
 * 2. The file Abc.js defines the package, the HELP and the available methods
 * 3. Abc.java is called from Abc.js
 */

var example=ABC.helloWorld("abcde");

//jexport("list",list);
jexport("test",test);
jexport("example",example);