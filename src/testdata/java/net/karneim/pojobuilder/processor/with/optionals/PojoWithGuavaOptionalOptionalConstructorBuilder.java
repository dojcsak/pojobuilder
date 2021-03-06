package net.karneim.pojobuilder.processor.with.optionals;

import com.google.common.base.Optional;
import java.util.List;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class PojoWithGuavaOptionalOptionalConstructorBuilder
    implements Cloneable {
  protected PojoWithGuavaOptionalOptionalConstructorBuilder self;
  protected Optional<Integer> value$boxedInt$com$google$common$base$Optional = Optional.absent();
  protected Optional<int[]> value$array$com$google$common$base$Optional = Optional.absent();
  protected Optional<List<Integer>> value$list$com$google$common$base$Optional = Optional.absent();

  /**
   * Creates a new {@link PojoWithGuavaOptionalOptionalConstructorBuilder}.
   */
  public PojoWithGuavaOptionalOptionalConstructorBuilder() {
    self = (PojoWithGuavaOptionalOptionalConstructorBuilder)this;
  }

  /**
   * Sets the default value for the {@link PojoWithGuavaOptionalOptionalConstructor#boxedInt} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PojoWithGuavaOptionalOptionalConstructorBuilder withBoxedInt(Integer value) {
    if (value == null) {
      this.value$boxedInt$com$google$common$base$Optional = null;
    } else {
      this.value$boxedInt$com$google$common$base$Optional = Optional.of(value);
    }
    return self;
  }

  /**
   * Optionally sets the default value for the {@link PojoWithGuavaOptionalOptionalConstructor#boxedInt} property.
   *
   * @param optionalValue the optional default value
   * @return this builder
   */
  public PojoWithGuavaOptionalOptionalConstructorBuilder withBoxedInt(Optional<Integer> optionalValue) {
    if (optionalValue == null || optionalValue.isPresent()) {
      this.value$boxedInt$com$google$common$base$Optional = optionalValue;
    }
    return self;
  }

  /**
   * Sets the default value for the {@link PojoWithGuavaOptionalOptionalConstructor#array} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PojoWithGuavaOptionalOptionalConstructorBuilder withArray(int[] value) {
    if (value == null) {
      this.value$array$com$google$common$base$Optional = null;
    } else {
      this.value$array$com$google$common$base$Optional = Optional.of(value);
    }
    return self;
  }

  /**
   * Optionally sets the default value for the {@link PojoWithGuavaOptionalOptionalConstructor#array} property.
   *
   * @param optionalValue the optional default value
   * @return this builder
   */
  public PojoWithGuavaOptionalOptionalConstructorBuilder withArray(Optional<int[]> optionalValue) {
    if (optionalValue == null || optionalValue.isPresent()) {
      this.value$array$com$google$common$base$Optional = optionalValue;
    }
    return self;
  }

  /**
   * Sets the default value for the {@link PojoWithGuavaOptionalOptionalConstructor#list} property.
   *
   * @param value the default value
   * @return this builder
   */
  public PojoWithGuavaOptionalOptionalConstructorBuilder withList(List<Integer> value) {
    if (value == null) {
      this.value$list$com$google$common$base$Optional = null;
    } else {
      this.value$list$com$google$common$base$Optional = Optional.of(value);
    }
    return self;
  }

  /**
   * Optionally sets the default value for the {@link PojoWithGuavaOptionalOptionalConstructor#list} property.
   *
   * @param optionalValue the optional default value
   * @return this builder
   */
  public PojoWithGuavaOptionalOptionalConstructorBuilder withList(Optional<List<Integer>> optionalValue) {
    if (optionalValue == null || optionalValue.isPresent()) {
      this.value$list$com$google$common$base$Optional = optionalValue;
    }
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      PojoWithGuavaOptionalOptionalConstructorBuilder result = (PojoWithGuavaOptionalOptionalConstructorBuilder)super.clone();
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
  public PojoWithGuavaOptionalOptionalConstructorBuilder but() {
    return (PojoWithGuavaOptionalOptionalConstructorBuilder)clone();
  }

  /**
   * Creates a new {@link PojoWithGuavaOptionalOptionalConstructor} based on this builder's settings.
   *
   * @return the created PojoWithGuavaOptionalOptionalConstructor
   */
  public PojoWithGuavaOptionalOptionalConstructor build() {
    try {
      Optional<Integer> _boxedInt = null;
      if (value$boxedInt$com$google$common$base$Optional == null || value$boxedInt$com$google$common$base$Optional.isPresent()) {
        _boxedInt = value$boxedInt$com$google$common$base$Optional;
      }
      Optional<int[]> _array = null;
      if (value$array$com$google$common$base$Optional == null || value$array$com$google$common$base$Optional.isPresent()) {
        _array = value$array$com$google$common$base$Optional;
      }
      Optional<List<Integer>> _list = null;
      if (value$list$com$google$common$base$Optional == null || value$list$com$google$common$base$Optional.isPresent()) {
        _list = value$list$com$google$common$base$Optional;
      }
      PojoWithGuavaOptionalOptionalConstructor result = new PojoWithGuavaOptionalOptionalConstructor(_boxedInt, _array, _list);
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
