parser grammar classes;


classDeclaration
    :   classRule identifierRule typeParameters?
        (extendsRule type)?
        (implementsRule typeList)?
        classBody
    ;



classBody
    :   ':'? INDENT classBodyDeclaration* DEDENT
    ;


classBodyDeclaration
    :   staticRule? block
    |   modifier* memberDeclaration
    ;



modifier
    :   classOrInterfaceModifier
    |   (   nativeRule
        |   synchronizedRule
        |   transientRule
        |   volatileRule
        )
    ;

classOrInterfaceModifier
    :   annotation       	// class or interface
    |   (   publicRule   	// class or interface
        |   protectedRule   // class or interface
        |   privateRule     // class or interface
        |   staticRule      // class or interface
        |   abstractRule    // class or interface
        |   finalRule       // class only -- does not apply to interfaces
        |   strictfpRule    // class or interface
        )
    ;



memberDeclaration
    :   classDeclaration					# memberDeclarationNL
    |   genericMethodDeclaration			# memberDeclarationNL
    |   methodDeclaration					# memberDeclarationNL
    |   fieldDeclaration					# memberDeclarationNoNL
    |   genericConstructorDeclaration		# memberDeclarationNL
    |   constructorDeclaration				# memberDeclarationNL
    |   interfaceDeclaration				# memberDeclarationNL
    |   annotationTypeDeclaration			# memberDeclarationNL
    |   enumDeclaration						# memberDeclarationNL
    ;