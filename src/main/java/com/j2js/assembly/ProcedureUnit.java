package com.j2js.assembly;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.apache.bcel.classfile.AnnotationEntry;

import com.j2js.Log;

public abstract class ProcedureUnit extends MemberUnit {
  private static final long serialVersionUID = -5991675116434005130L;

  // Set of all member signatures targeted by this method.
  private Collection<Signature> targetSignatures = new HashSet<Signature>();

  public ProcedureUnit(Signature theSignature, ClassUnit theDeclaringClazz, AnnotationEntry[] annotations) {
    super(theSignature, theDeclaringClazz, annotations);
  }

  public void addTarget(Signature targetSignature) {
    if (!targetSignature.toString().contains("#")) {
      throw new IllegalArgumentException("Signature must be field or method: " + targetSignature);
    }
    // Logger.getLogger().info("Adding " + this + " -> " + targetSignature);
    targetSignatures.add(targetSignature);
  }

  public void removeTargets() {
    Iterator<Signature> iter = targetSignatures.iterator();
    while (iter.hasNext()) {
      iter.next();
      iter.remove();
    }
  }

  void write(int depth, Writer writer) throws IOException {
    if (getData() == null)
      return;
    Log.getLogger().debug(getIndent(depth) + getSignature());
    writer.write(getData());
  }

  public String getData() {
    if (!declaringClass.isResolved())
      throw new RuntimeException("Class must be resolved");
    return super.getData();
  }

  public Collection<Signature> getTargetSignatures() {
    return targetSignatures;
  }
}
