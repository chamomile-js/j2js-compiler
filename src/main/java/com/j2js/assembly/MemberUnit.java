package com.j2js.assembly;

import org.apache.bcel.classfile.AnnotationEntry;

/**
 * The MemberUnit class is the base class for Field, Method and Constructor
 * objects.
 * 
 * @author wolle
 */
public abstract class MemberUnit extends Unit {
  private static final long serialVersionUID = 1216982706352044056L;

  // The class to which this method belongs.
  ClassUnit declaringClass;
  
  private final transient AnnotationEntry[] annotations;

  MemberUnit(Signature theSignature, ClassUnit theDeclaringClazz, AnnotationEntry[] annotations) {
    setSignature(theSignature);
    declaringClass = theDeclaringClazz;
    declaringClass.addMemberUnit(this);
    this.annotations = annotations;
  }

  public ClassUnit getDeclaringClass() {
    return declaringClass;
  }
  
	public AnnotationEntry[] getAnnotations() {
		return annotations;
	}

	public Signature getAbsoluteSignature() {
		Signature s = Project.getSingleton().getSignature(declaringClass.toString(), getSignature().toString());
		return s;
	}

  public String toString() {
    return declaringClass.getName() + "#" + super.toString();
  }
}
