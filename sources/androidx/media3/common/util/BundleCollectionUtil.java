package androidx.media3.common.util;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import defpackage.d31;
import defpackage.d42;
import defpackage.gs0;
import defpackage.i31;
import defpackage.y21;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class BundleCollectionUtil {
    public static HashMap<String, String> bundleToStringHashMap(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static i31 bundleToStringImmutableMap(Bundle bundle) {
        return bundle == Bundle.EMPTY ? d42.g : i31.f(bundleToStringHashMap(bundle));
    }

    public static void ensureClassLoader(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleCollectionUtil.class.getClassLoader()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> SparseArray<T> fromBundleSparseArray(gs0 gs0Var, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), gs0Var.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static Bundle stringMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> toBundleArrayList(Collection<T> collection, gs0 gs0Var) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) gs0Var.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray, gs0 gs0Var) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), (Bundle) gs0Var.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    private BundleCollectionUtil() {
    }

    public static <T> d31 fromBundleList(gs0 gs0Var, List<Bundle> list) {
        y21 y21VarX = d31.x();
        for (int i = 0; i < list.size(); i++) {
            y21VarX.a(gs0Var.apply((Bundle) Assertions.checkNotNull(list.get(i))));
        }
        return y21VarX.g();
    }

    public static Bundle getBundleWithDefault(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        if (bundle3 != null) {
            return bundle3;
        }
        return bundle2;
    }

    public static ArrayList<Integer> getIntegerArrayListWithDefault(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        return arrayList;
    }

    public static <T> d31 toBundleList(List<T> list, gs0 gs0Var) {
        y21 y21VarX = d31.x();
        for (int i = 0; i < list.size(); i++) {
            y21VarX.a((Bundle) gs0Var.apply(list.get(i)));
        }
        return y21VarX.g();
    }
}
