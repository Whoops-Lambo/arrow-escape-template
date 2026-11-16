package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.core.view.NestedScrollingChild;
import com.facebook.a0;
import com.facebook.internal.v0;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b63 {
    public static final b63 a = new b63();
    public static WeakReference b = new WeakReference(null);
    public static Method c;

    public static final View a(View view) {
        if (!lz.a.contains(b63.class)) {
            while (view != null) {
                try {
                    b63 b63Var = a;
                    boolean zEquals = false;
                    if (!lz.a.contains(b63Var)) {
                        try {
                            zEquals = view.getClass().getName().equals("com.facebook.react.ReactRootView");
                        } catch (Throwable th) {
                            lz.a(b63Var, th);
                        }
                    }
                    if (!zEquals) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        return view;
                    }
                } catch (Throwable th2) {
                    lz.a(b63.class, th2);
                }
            }
        }
        return null;
    }

    public static final ArrayList b(View view) {
        if (lz.a.contains(b63.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lz.a(b63.class, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0050 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0062, B:39:0x005d, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    /* JADX WARN: Code duplicated, block: B:41:0x0062 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0062, B:39:0x005d, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final int c(View view) {
        Class<?> cls;
        Class cls2;
        Set set = lz.a;
        if (set.contains(b63.class)) {
            return 0;
        }
        try {
            view.getClass();
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            boolean zContains = set.contains(b63.class);
            b63 b63Var = a;
            if (!zContains) {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        if (set.contains(b63Var)) {
                            cls = null;
                            if (cls != null || !cls.isInstance(parent)) {
                                cls2 = lz.a.contains(b63Var) ? null : NestedScrollingChild.class;
                                if (cls2 != null && cls2.isInstance(parent)) {
                                }
                            }
                        } else {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                                cls = null;
                            } catch (Throwable th) {
                                lz.a(b63Var, th);
                                cls = null;
                            }
                            if (cls != null) {
                                if (lz.a.contains(b63Var)) {
                                }
                                if (cls2 != null) {
                                }
                            } else {
                                if (lz.a.contains(b63Var)) {
                                }
                                if (cls2 != null) {
                                }
                            }
                        }
                    }
                    i |= 512;
                } catch (Throwable th2) {
                    lz.a(b63.class, th2);
                }
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i | 16384;
                    }
                    return ((view instanceof ViewGroup) && b63Var.m(view, (View) b.get())) ? i | 64 : i;
                }
                return i | 4096;
            }
            int i2 = i | 1025;
            if (view instanceof Button) {
                i2 = i | 1029;
                if (view instanceof Switch) {
                    i2 = i | 9221;
                } else if (view instanceof CheckBox) {
                    i2 = 33797 | i;
                }
            }
            int i3 = i2;
            return view instanceof EditText ? i3 | 2048 : i3;
        } catch (Throwable th3) {
            lz.a(b63.class, th3);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (lz.a.contains(b63.class)) {
            return null;
        }
        try {
            view.getClass();
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                n(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListB = b(view);
                int size = arrayListB.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(d((View) arrayListB.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e) {
                Log.e("b63", "Failed to create JSONObject for view.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            lz.a(b63.class, th);
            return null;
        }
    }

    public static final View.OnClickListener f(View view) {
        if (lz.a.contains(b63.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass();
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            lz.a(b63.class, th);
            return null;
        }
    }

    public static final View.OnTouchListener g(View view) {
        try {
            if (!lz.a.contains(b63.class)) {
                try {
                    try {
                        Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(view);
                        if (obj != null) {
                            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                            declaredField2.setAccessible(true);
                            Object obj2 = declaredField2.get(obj);
                            obj2.getClass();
                            return (View.OnTouchListener) obj2;
                        }
                    } catch (ClassNotFoundException unused) {
                        a0 a0Var = a0.a;
                    } catch (IllegalAccessException unused2) {
                        a0 a0Var2 = a0.a;
                    }
                } catch (NoSuchFieldException unused3) {
                    a0 a0Var3 = a0.a;
                }
            }
            return null;
        } catch (Throwable th) {
            lz.a(b63.class, th);
            return null;
        }
    }

    public static final String h(View view) {
        CharSequence hint;
        String string;
        if (lz.a.contains(b63.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            lz.a(b63.class, th);
            return null;
        }
    }

    public static final ViewGroup i(View view) {
        if (!lz.a.contains(b63.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th) {
                lz.a(b63.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f4 A[EDGE_INSN: B:42:0x00f4->B:43:0x00f5 BREAK  A[LOOP:0: B:32:0x00c8->B:38:0x00e2]] */
    public static final String j(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (lz.a.contains(b63.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i = 0;
                                while (true) {
                                    if (i >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i++;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            currentHour.getClass();
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            currentMinute.getClass();
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(currentMinute.intValue())}, 2));
                        }
                    } else {
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            lz.a(b63.class, th);
            return null;
        }
    }

    public static final void n(View view, JSONObject jSONObject) {
        if (lz.a.contains(b63.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String strJ = j(view);
                String strH = h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                if (k92.k(view)) {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", v0.f(v0.X(strJ)));
                }
                jSONObject.put("hint", v0.f(v0.X(strH)));
                if (tag != null) {
                    jSONObject.put("tag", v0.f(v0.X(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, v0.f(v0.X(contentDescription.toString())));
                }
                jSONObject.put("dimension", a.e(view));
            } catch (JSONException unused) {
                a0 a0Var = a0.a;
            }
        } catch (Throwable th) {
            lz.a(b63.class, th);
        }
    }

    public final JSONObject e(View view) {
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e) {
                Log.e("b63", "Failed to create JSONObject for dimension.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    public final View k(View view, float[] fArr) {
        if (!lz.a.contains(this)) {
            try {
                l();
                Method method = c;
                if (method != null && view != null) {
                    try {
                        Object objInvoke = method.invoke(null, fArr, view);
                        objInvoke.getClass();
                        View view2 = (View) objInvoke;
                        if (view2.getId() > 0) {
                            Object parent = view2.getParent();
                            parent.getClass();
                            return (View) parent;
                        }
                    } catch (IllegalAccessException unused) {
                        a0 a0Var = a0.a;
                    } catch (InvocationTargetException unused2) {
                        a0 a0Var2 = a0.a;
                    }
                }
            } catch (Throwable th) {
                lz.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void l() {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            if (c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                a0 a0Var = a0.a;
            } catch (NoSuchMethodException unused2) {
                a0 a0Var2 = a0.a;
            }
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }

    public final boolean m(View view, View view2) {
        Set set = lz.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            view.getClass();
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!set.contains(this)) {
                try {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    fArr = new float[]{iArr[0], iArr[1]};
                } catch (Throwable th) {
                    lz.a(this, th);
                }
            }
            View viewK = k(view2, fArr);
            return viewK != null && viewK.getId() == view.getId();
        } catch (Throwable th2) {
            lz.a(this, th2);
            return false;
        }
    }
}
