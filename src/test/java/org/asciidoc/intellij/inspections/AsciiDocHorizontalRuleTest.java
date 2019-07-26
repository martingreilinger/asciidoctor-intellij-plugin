package org.asciidoc.intellij.inspections;

import org.asciidoc.intellij.quickfix.AsciiDocConvertMarkdownHorizontalRule;

public class AsciiDocHorizontalRuleTest extends AsciiDocQuickFixTestBase {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    myFixture.enableInspections(AsciidocHorizontalRuleInspection.class);
  }

  public void testMarkdownHorizontalRuleDash() {
    doTest(AsciiDocConvertMarkdownHorizontalRule.NAME, true);
  }

  public void testMarkdownHorizontalRuleStar() {
    doTest(AsciiDocConvertMarkdownHorizontalRule.NAME, true);
  }

  public void testMarkdownHorizontalRuleUnderscore() {
    doTest(AsciiDocConvertMarkdownHorizontalRule.NAME, true);
  }

  @Override
  protected String getBasePath() {
    return "inspections/horizontalrule";
  }
}
