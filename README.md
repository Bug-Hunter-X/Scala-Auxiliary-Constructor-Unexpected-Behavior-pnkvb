# Scala Auxiliary Constructor Bug

This example demonstrates a potential pitfall when using auxiliary constructors in Scala. The `MyClass` class defines an auxiliary constructor that initializes `x` to 0 if no value is provided.  However, there might be subtle cases where this default value isn't handled as expected or causes unexpected behavior further in the code. The `main` method showcases this potential issue.  The `bugSolution.scala` file provides a corrected version of the code.