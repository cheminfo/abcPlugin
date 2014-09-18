/**
 * @object IJ
 * Library that provides methods for image manipulation.
 */
var ABC = {
	/**
	 * @function helloWorld
	 * This function prints the hello world message. You can pass a parameter. 
	 * That returns  args+", Hello World!"
	 * @param  args	The parameter
	 */
	helloWorld: function(args) {
		return ABCAPI.helloWorld(args);
	},
	
	/**
	 * @function getName(object)
	 * This function retrieve the parameter "name" from a json object.
	 */
	getName: function(filename) {
		return ABCAPI.getName(Global.basedir, Global.basedirkey, filename);
	}
		
};