package net.karneim.pojobuilder.processor.with.constructor;

import javax.annotation.Generated;

@Generated("PojoBuilder")
public class SampleAnnotatedWithPackagePrivateConstructorBuilder
    implements Cloneable {
  protected SampleAnnotatedWithPackagePrivateConstructorBuilder self;

  /**
   * Creates a new {@link SampleAnnotatedWithPackagePrivateConstructorBuilder}.
   */
  SampleAnnotatedWithPackagePrivateConstructorBuilder() {
    self = (SampleAnnotatedWithPackagePrivateConstructorBuilder)this;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      SampleAnnotatedWithPackagePrivateConstructorBuilder result = (SampleAnnotatedWithPackagePrivateConstructorBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  public SampleAnnotatedWithPackagePrivateConstructorBuilder but() {
    return (SampleAnnotatedWithPackagePrivateConstructorBuilder)clone();
  }

  /**
   * Creates a new {@link SampleAnnotatedWithPackagePrivateConstructor} based on this builder's settings.
   *
   * @return the created SampleAnnotatedWithPackagePrivateConstructor
   */
  public SampleAnnotatedWithPackagePrivateConstructor build() {
    try {
      SampleAnnotatedWithPackagePrivateConstructor result = new SampleAnnotatedWithPackagePrivateConstructor();
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
