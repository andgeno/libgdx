/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSparseSdf3 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btSparseSdf3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btSparseSdf3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btSparseSdf3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCells(SWIGTYPE_p_btAlignedObjectArrayT_btSparseSdfT_3_t__Cell_p_t value) {
    gdxBulletJNI.btSparseSdf3_cells_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btSparseSdfT_3_t__Cell_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btSparseSdfT_3_t__Cell_p_t getCells() {
    long cPtr = gdxBulletJNI.btSparseSdf3_cells_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btSparseSdfT_3_t__Cell_p_t(cPtr, false);
  }

  public void setVoxelsz(float value) {
    gdxBulletJNI.btSparseSdf3_voxelsz_set(swigCPtr, this, value);
  }

  public float getVoxelsz() {
    return gdxBulletJNI.btSparseSdf3_voxelsz_get(swigCPtr, this);
  }

  public void setPuid(int value) {
    gdxBulletJNI.btSparseSdf3_puid_set(swigCPtr, this, value);
  }

  public int getPuid() {
    return gdxBulletJNI.btSparseSdf3_puid_get(swigCPtr, this);
  }

  public void setNcells(int value) {
    gdxBulletJNI.btSparseSdf3_ncells_set(swigCPtr, this, value);
  }

  public int getNcells() {
    return gdxBulletJNI.btSparseSdf3_ncells_get(swigCPtr, this);
  }

  public void setNprobes(int value) {
    gdxBulletJNI.btSparseSdf3_nprobes_set(swigCPtr, this, value);
  }

  public int getNprobes() {
    return gdxBulletJNI.btSparseSdf3_nprobes_get(swigCPtr, this);
  }

  public void setNqueries(int value) {
    gdxBulletJNI.btSparseSdf3_nqueries_set(swigCPtr, this, value);
  }

  public int getNqueries() {
    return gdxBulletJNI.btSparseSdf3_nqueries_get(swigCPtr, this);
  }

  public void Initialize(int hashsize) {
    gdxBulletJNI.btSparseSdf3_Initialize__SWIG_0(swigCPtr, this, hashsize);
  }

  public void Initialize() {
    gdxBulletJNI.btSparseSdf3_Initialize__SWIG_1(swigCPtr, this);
  }

  public void Reset() {
    gdxBulletJNI.btSparseSdf3_Reset(swigCPtr, this);
  }

  public void GarbageCollect(int lifetime) {
    gdxBulletJNI.btSparseSdf3_GarbageCollect__SWIG_0(swigCPtr, this, lifetime);
  }

  public void GarbageCollect() {
    gdxBulletJNI.btSparseSdf3_GarbageCollect__SWIG_1(swigCPtr, this);
  }

  public int RemoveReferences(btCollisionShape pcs) {
    return gdxBulletJNI.btSparseSdf3_RemoveReferences(swigCPtr, this, btCollisionShape.getCPtr(pcs), pcs);
  }

  public float Evaluate(Vector3 x, btCollisionShape shape, Vector3 normal, float margin) {
    return gdxBulletJNI.btSparseSdf3_Evaluate(swigCPtr, this, x, btCollisionShape.getCPtr(shape), shape, normal, margin);
  }

  public void BuildCell(SWIGTYPE_p_btSparseSdfT_3_t__Cell c) {
    gdxBulletJNI.btSparseSdf3_BuildCell(swigCPtr, this, SWIGTYPE_p_btSparseSdfT_3_t__Cell.getCPtr(c));
  }

  public static float DistanceToShape(Vector3 x, btCollisionShape shape) {
    return gdxBulletJNI.btSparseSdf3_DistanceToShape(x, btCollisionShape.getCPtr(shape), shape);
  }

  public static SWIGTYPE_p_btSparseSdfT_3_t__IntFrac Decompose(float x) {
    return new SWIGTYPE_p_btSparseSdfT_3_t__IntFrac(gdxBulletJNI.btSparseSdf3_Decompose(x), true);
  }

  public static float Lerp(float a, float b, float t) {
    return gdxBulletJNI.btSparseSdf3_Lerp(a, b, t);
  }

  public static long Hash(int x, int y, int z, btCollisionShape shape) {
    return gdxBulletJNI.btSparseSdf3_Hash(x, y, z, btCollisionShape.getCPtr(shape), shape);
  }

  public btSparseSdf3() {
    this(gdxBulletJNI.new_btSparseSdf3(), true);
  }

}
