# Introduction #
dotify.formatter.impl contains an implementation of the formatter interfaces of [dotify.api](https://github.com/joeha480/dotify/tree/master/dotify.api).

[Here](https://rawgit.com/joeha480/dotify/master/dotify.formatter.impl/test/org/daisy/dotify/engine/impl/resource-files/tests-overview.xml) are a few OBFL examples.

## How to add tests to dotify.formatter.impl

OBFL-to-PEF tests can be added by including lines such as the
following:

```java
testPEF("resource-files/foo-input.obfl", "resource-files/foo-expected.pef", false);
```

in a class that extends `AbstractFormatterEngineTest`. Tests are run
with `gradle test`.

If you want the tests to be included in the overview page at
`test/org/daisy/dotify/engine/impl/resource-files/tests-overview.xml`,
the OBFL and PEF files need to be placed in
`test/org/daisy/dotify/engine/impl/resource-files` and named according
to the pattern `foo-input.obfl`/`foo-expected.pef`. The page can be
updated with `gradle updateTestsOverviewFile`.
