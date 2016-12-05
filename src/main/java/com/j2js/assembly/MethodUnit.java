package com.j2js.assembly;

import org.apache.bcel.classfile.AnnotationEntry;

/**
 * A MethodUnit provides information about, and access to, a single method on a
 * class or interface.
 * 
 * @author wolle
 */
public class MethodUnit extends ProcedureUnit {
  private static final long serialVersionUID = 3654870432099936425L;

  public MethodUnit(Signature theSignature, ClassUnit theDeclaringClazz, AnnotationEntry[] annotations) {
    super(theSignature, theDeclaringClazz, annotations);
  }
}
