// Set the project name to the string 'My Project'
name := "ScalaStudyGroup"

// The := method used in Name and Version is one of two fundamental methods.
// The other method is <<=
// All other initialization methods are implemented in terms of these.
version := "0.1"

scalaVersion := "2.9.0-1"

libraryDependencies += "junit" % "junit" % "4.8.2" % "test->default"

libraryDependencies += "com.novocode" % "junit-interface" % "0.6" % "test->default"

// Exclude backup files by default.  This uses ~=, which accepts a function of
//  type T => T (here T = FileFilter) that is applied to the existing value.
// A similar idea is overriding a member and applying a function to the super value:
//  override lazy val defaultExcludes = f(super.defaultExcludes)
//
defaultExcludes ~= (filter => filter || "*~")
/*  Some equivalent ways of writing this:
defaultExcludes ~= (_ || "*~")
defaultExcludes ~= ( (_: FileFilter) || "*~")
defaultExcludes ~= ( (filter: FileFilter) => filter || "*~")
*/

