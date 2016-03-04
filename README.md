RSQL_rest_demo
==============
Way to implement RSQL restfull api

Introduction
------------

RESTful Service Query Language (RSQL) is a language and a library designed for searching entries in RESTful services.

This library provides converter of RSQL expression to JPA Criteria Query (object representation of JPQL), which is translated to SQL query. RSQL was originally created for KOSapi - RESTful web services for IS at the Czech Technical University in Prague.

Feel free to contribute!

Overview

The interaction with this API occurs from the JpaCriteriaQueryVisitor class. It has provided method for configuration purposes: getBuilderTools.

From getBuilderTools you can access or modify the ArgumentParser (a class responsible for parsing the string arguments into respective classes), the PropertiesMapper (a class responsible from re-mapping properties) and an optional PredicateBuilder (needed when you have an new ComparisonNode defined with the rsql-parser API).

If you want more control you may use the new JpaPredicateVisitor class.

In the usage section we will cover all that usages.


Files
-----

[RSQL jpa](https://github.com/fstn/rsql-jpa)
[RSQL parser](https://github.com/fstn/rsql-parser)


