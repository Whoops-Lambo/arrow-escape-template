package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C4664b4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class b1 {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements View.OnTouchListener {
        JSONArray a = new JSONArray();
        final /* synthetic */ View b;
        final /* synthetic */ String c;
        final /* synthetic */ View.OnTouchListener d;

        public a(View view, String str, View.OnTouchListener onTouchListener) {
            this.b = view;
            this.c = str;
            this.d = onTouchListener;
        }

        private void a() {
            this.a = new JSONArray();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                b1.b(this.a, motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        a();
                    }
                } else {
                    b1.b(this.b, motionEvent, this.a, this.c);
                    a();
                }
            } else {
                a();
                b1.b(this.a, motionEvent);
                b1.b(this.b, motionEvent, this.a, this.c);
            }
            View.OnTouchListener onTouchListener = this.d;
            if (onTouchListener != null) {
                onTouchListener.onTouch(view, motionEvent);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(JSONArray jSONArray, MotionEvent motionEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4664b4.i.j0, a(motionEvent));
            jSONObject.put("eventTime", String.valueOf(motionEvent.getEventTime()));
            jSONObject.put("downTime", String.valueOf(motionEvent.getDownTime()));
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                JSONObject jSONObject2 = new JSONObject();
                if (Build.VERSION.SDK_INT >= 29) {
                    jSONObject2.put("x", String.valueOf(motionEvent.getRawX(i)));
                    jSONObject2.put("y", String.valueOf(motionEvent.getRawY(i)));
                } else {
                    jSONObject2.put("x", String.valueOf(motionEvent.getRawX()));
                    jSONObject2.put("y", String.valueOf(motionEvent.getRawY()));
                }
                jSONObject2.put("pressure", String.valueOf(motionEvent.getPressure(i)));
                jSONObject2.put("size", String.valueOf(motionEvent.getSize(i)));
                jSONObject2.put("id", motionEvent.getPointerId(i));
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("point", jSONArray2);
            jSONArray.put(jSONObject);
        } catch (Exception e) {
            Log.e("TouchEventReporter", "collectEvent JSON error", e);
        }
    }

    private static String a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked != 6) {
                                return "other_" + motionEvent.getActionMasked();
                            }
                            return "pointer_up_" + motionEvent.getPointerId(motionEvent.getActionIndex());
                        }
                        return "pointer_down_" + motionEvent.getPointerId(motionEvent.getActionIndex());
                    }
                    return "cancel";
                }
                return "move";
            }
            return "up";
        }
        return "down";
    }

    public static void a(View view, String str, int i) {
        a(view, str, i, (View.OnTouchListener) null);
    }

    public static void a(View view, String str, int i, View.OnTouchListener onTouchListener) {
        if (i != 0) {
            if (view == null) {
                return;
            }
            view.setOnTouchListener(new a(view, str, onTouchListener));
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(str);
            if (cVarB != null) {
                cVarB.a(cVarB.s() + "m_check_local_c");
            }
        } catch (Exception e) {
            q0.b("TouchEventReporter", e.getMessage());
        }
        if (onTouchListener == null || view == null) {
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    private static String a(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (view instanceof ViewGroup) {
            view = a((ViewGroup) view, (int) rawX, (int) rawY);
        }
        return a(view);
    }

    private static View a(ViewGroup viewGroup, int i, int i2) {
        View viewA;
        int[] iArr = new int[2];
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                int width = childAt.getWidth() + i3;
                int height = childAt.getHeight() + i4;
                if (i >= i3 && i <= width && i2 >= i4 && i2 <= height) {
                    return (!(childAt instanceof ViewGroup) || (viewA = a((ViewGroup) childAt, i, i2)) == null) ? childAt : viewA;
                }
            }
        }
        return viewGroup;
    }

    private static String a(View view) {
        String resourceEntryName;
        if (view == null) {
            return "UnknownView";
        }
        try {
            resourceEntryName = view.getId() != -1 ? view.getResources().getResourceEntryName(view.getId()) : "";
        } catch (Exception unused) {
        }
        return view.getClass().getSimpleName() + "#" + resourceEntryName + "#" + (view.getContentDescription() != null ? view.getContentDescription().toString() : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, MotionEvent motionEvent, JSONArray jSONArray, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("targetView", a(view, motionEvent));
            jSONObject.put("eventList", jSONArray);
        } catch (JSONException e) {
            Log.e("TouchEventReporter", "JSON build error", e);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(str);
        if (cVarB != null) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("eventList", jSONObject);
            cVarB.b("m_check_local_c", eVar);
        }
    }
}
