package com.j2js;

import java.util.Map;

import org.apache.bcel.classfile.Attribute;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.Visitor;

public class AnnotationAttribute extends Attribute {
  private static final long serialVersionUID = 4353575689843465758L;

  Map<String, String>[] annotations;

  protected AnnotationAttribute(byte tag, int nameIndex, int length, ConstantPool constantPool) {
    super(tag, nameIndex, length, constantPool);
  }

  @Override
  public void accept(Visitor arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public Attribute copy(ConstantPool arg0) {
    // TODO Auto-generated method stub
    return null;
  }
}
