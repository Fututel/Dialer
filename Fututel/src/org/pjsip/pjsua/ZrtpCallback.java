/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class ZrtpCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ZrtpCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ZrtpCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_ZrtpCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    pjsuaJNI.ZrtpCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    pjsuaJNI.ZrtpCallback_change_ownership(this, swigCPtr, true);
  }

  public void on_zrtp_show_sas(int call_id, pj_str_t sas, int verified) {
    if (getClass() == ZrtpCallback.class) pjsuaJNI.ZrtpCallback_on_zrtp_show_sas(swigCPtr, this, call_id, pj_str_t.getCPtr(sas), sas, verified); else pjsuaJNI.ZrtpCallback_on_zrtp_show_sasSwigExplicitZrtpCallback(swigCPtr, this, call_id, pj_str_t.getCPtr(sas), sas, verified);
  }

  public void on_zrtp_update_transport(int call_id) {
    if (getClass() == ZrtpCallback.class) pjsuaJNI.ZrtpCallback_on_zrtp_update_transport(swigCPtr, this, call_id); else pjsuaJNI.ZrtpCallback_on_zrtp_update_transportSwigExplicitZrtpCallback(swigCPtr, this, call_id);
  }

  public ZrtpCallback() {
    this(pjsuaJNI.new_ZrtpCallback(), true);
    pjsuaJNI.ZrtpCallback_director_connect(this, swigCPtr, swigCMemOwn, false);
  }

}

