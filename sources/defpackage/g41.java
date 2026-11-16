package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.a0;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g41 {
    public static final g41 a = new g41();
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static final String d = a0.a().getPackageName();
    public static final SharedPreferences e = a0.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    public static final SharedPreferences f = a0.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList f(Context context, Object obj) {
        if (lz.a.contains(g41.class)) {
            return null;
        }
        try {
            g41 g41Var = a;
            return g41Var.a(g41Var.e(context, obj, "inapp"));
        } catch (Throwable th) {
            lz.a(g41.class, th);
            return null;
        }
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2;
        SharedPreferences sharedPreferences = f;
        ArrayList arrayList3 = null;
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList4 = new ArrayList();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    long j = jSONObject.getLong("purchaseTime");
                    arrayList2 = arrayList3;
                    try {
                        try {
                            String string2 = jSONObject.getString("purchaseToken");
                            if (jCurrentTimeMillis - (j / 1000) <= 86400 && !s71.b(sharedPreferences.getString(string, ""), string2)) {
                                editorEdit.putString(string, string2);
                                arrayList4.add(str);
                            }
                        } catch (Throwable th) {
                            th = th;
                            lz.a(this, th);
                            return arrayList2;
                        }
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    arrayList2 = arrayList3;
                }
                arrayList3 = arrayList2;
            }
            arrayList2 = arrayList3;
            editorEdit.apply();
            return arrayList4;
        } catch (Throwable th2) {
            th = th2;
            arrayList2 = arrayList3;
        }
    }

    public final Class b(Context context, String str) {
        Class<?> clsLoadClass;
        HashMap map = c;
        Set set = lz.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            Class cls = (Class) map.get(str);
            if (cls != null) {
                return cls;
            }
            if (set.contains(l41.class)) {
                clsLoadClass = null;
            } else {
                try {
                    clsLoadClass = context.getClassLoader().loadClass(str);
                } catch (ClassNotFoundException unused) {
                    clsLoadClass = null;
                } catch (Throwable th) {
                    lz.a(l41.class, th);
                    clsLoadClass = null;
                }
            }
            if (clsLoadClass != null) {
                map.put(str, clsLoadClass);
            }
            return clsLoadClass;
        } catch (Throwable th2) {
            lz.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    public final Method c(Class cls, String str) {
        Class[] clsArr;
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            HashMap map = b;
            Method method = (Method) map.get(str);
            if (method != null) {
                return method;
            }
            Class cls2 = Integer.TYPE;
            switch (str) {
                case "getPurchases":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    cls2.getClass();
                    clsArr = new Class[]{cls2, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            Method methodH = clsArr == null ? l41.h(cls, str, null) : l41.h(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (methodH != null) {
                map.put(str, methodH);
            }
            return methodH;
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    public final ArrayList d(Context context, Object obj) {
        ArrayList arrayList;
        ArrayList<String> stringArrayList;
        ArrayList arrayList2 = null;
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList3 = new ArrayList();
            Context context2 = context;
            Object obj2 = obj;
            if (i(context2, obj2, "inapp")) {
                Object string = null;
                int i = 0;
                boolean z = false;
                while (true) {
                    Object objH = h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj2, new Object[]{6, d, "inapp", string, new Bundle()});
                    if (objH != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objH;
                        if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            arrayList = arrayList2;
                            string = arrayList;
                        } else {
                            int size = stringArrayList.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    arrayList = arrayList2;
                                    break;
                                }
                                String str = stringArrayList.get(i2);
                                i2++;
                                String str2 = str;
                                arrayList = arrayList2;
                                try {
                                    try {
                                        if (jCurrentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / 1000) > 1200) {
                                            z = true;
                                            break;
                                        }
                                        arrayList3.add(str2);
                                        i++;
                                    } catch (Throwable th) {
                                        th = th;
                                        lz.a(this, th);
                                        return arrayList;
                                    }
                                } catch (JSONException unused) {
                                }
                                arrayList2 = arrayList;
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        }
                    } else {
                        arrayList = arrayList2;
                        string = arrayList;
                    }
                    if (i >= 30 || string == null || z) {
                        break;
                    }
                    context2 = context;
                    obj2 = obj;
                    arrayList2 = arrayList;
                }
            }
            return arrayList3;
        } catch (Throwable th2) {
            th = th2;
            arrayList = arrayList2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    public final ArrayList e(Context context, Object obj, String str) {
        g41 g41Var;
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && i(context, obj, str)) {
                int size = 0;
                String string = null;
                while (true) {
                    g41Var = this;
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object objH = g41Var.h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj2, new Object[]{3, d, str, string});
                        if (objH == null) {
                            string = null;
                            if (size >= 30) {
                                break;
                            }
                            break;
                            break;
                        }
                        Bundle bundle = (Bundle) objH;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size >= 30 || string == null) {
                            break;
                        }
                        this = g41Var;
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th) {
                        th = th;
                        lz.a(g41Var, th);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g41Var = this;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z) {
        g41 g41Var;
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                g41Var = this;
                try {
                    Object objH = g41Var.h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, d, z ? "subs" : "inapp", bundle});
                    if (objH != null) {
                        Bundle bundle2 = (Bundle) objH;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    Object obj2 = arrayList.get(i);
                                    obj2.getClass();
                                    String str = stringArrayList.get(i);
                                    str.getClass();
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            g41Var.k(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    lz.a(g41Var, th);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            th = th2;
            g41Var = this;
            lz.a(g41Var, th);
            return null;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodC;
        if (!lz.a.contains(this)) {
            try {
                Class clsB = b(context, str);
                if (clsB != null && (methodC = c(clsB, str2)) != null) {
                    return l41.l(clsB, methodC, obj, Arrays.copyOf(objArr, objArr.length));
                }
            } catch (Throwable th) {
                lz.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str) {
        g41 g41Var;
        if (!lz.a.contains(this) && obj != null) {
            try {
                g41Var = this;
                try {
                    Object objH = g41Var.h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, d, str});
                    if (objH != null && ((Integer) objH).intValue() == 0) {
                        return true;
                    }
                } catch (Throwable th) {
                    th = th;
                    lz.a(g41Var, th);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                g41Var = this;
            }
        }
        return false;
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        if (lz.a.contains(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                String string = e.getString(str, null);
                if (string != null) {
                    List listN0 = dk2.n0(string, new String[]{";"}, 2, 2);
                    if (jCurrentTimeMillis - Long.parseLong((String) listN0.get(0)) < 43200) {
                        str.getClass();
                        linkedHashMap.put(str, listN0.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            lz.a(this, th);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (lz.a.contains(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th) {
            lz.a(this, th);
        }
    }
}
