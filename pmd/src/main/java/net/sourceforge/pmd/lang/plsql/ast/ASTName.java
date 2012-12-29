/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

/* Generated By:JJTree: Do not edit this line. ASTName.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package net.sourceforge.pmd.lang.plsql.ast;

import net.sourceforge.pmd.lang.plsql.symboltable.NameDeclaration;

public class ASTName extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode{
  public ASTName(int id) {
    super(id);
  }

  public ASTName(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  private NameDeclaration nd;

  public void setNameDeclaration(NameDeclaration nd) {
    this.nd = nd;
  }

  public NameDeclaration getNameDeclaration() {
    return this.nd;
  }
}
/* JavaCC - OriginalChecksum=6632a8172232ffa3f56efbf465e4eb8e (do not edit this line) */
