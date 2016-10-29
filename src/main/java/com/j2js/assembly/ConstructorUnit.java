package com.j2js.assembly;

/**
 * ConstructorUnit provides information about, and access to, a single
 * constructor for a class.
 * 
 * @author wolle
 */
public class ConstructorUnit extends ProcedureUnit {
  private static final long serialVersionUID = 1999530334067906973L;

  public ConstructorUnit(Signature theSignature, ClassUnit theDeclaringClazz) {
    super(theSignature, theDeclaringClazz);
  }

}
