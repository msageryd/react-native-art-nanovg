/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robclouth.art_nanovg.nanovg;

public final class GLNVGshaderType {
  public final static GLNVGshaderType NSVG_SHADER_FILLGRAD = new GLNVGshaderType("NSVG_SHADER_FILLGRAD");
  public final static GLNVGshaderType NSVG_SHADER_FILLIMG = new GLNVGshaderType("NSVG_SHADER_FILLIMG");
  public final static GLNVGshaderType NSVG_SHADER_SIMPLE = new GLNVGshaderType("NSVG_SHADER_SIMPLE");
  public final static GLNVGshaderType NSVG_SHADER_IMG = new GLNVGshaderType("NSVG_SHADER_IMG");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GLNVGshaderType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GLNVGshaderType.class + " with value " + swigValue);
  }

  private GLNVGshaderType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GLNVGshaderType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GLNVGshaderType(String swigName, GLNVGshaderType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GLNVGshaderType[] swigValues = { NSVG_SHADER_FILLGRAD, NSVG_SHADER_FILLIMG, NSVG_SHADER_SIMPLE, NSVG_SHADER_IMG };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

