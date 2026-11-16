package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import defpackage.d31;
import defpackage.y21;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class BundleableUtil {
    public static void ensureClassLoader(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) Util.castNonNull(BundleableUtil.class.getClassLoader()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Bundleable> SparseArray<T> fromBundleSparseArray(Bundleable.Creator<T> creator, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), creator.fromBundle(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static <T extends Bundleable> ArrayList<Bundle> toBundleArrayList(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends Bundleable> SparseArray<Bundle> toBundleSparseArray(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i).toBundle());
        }
        return sparseArray2;
    }

    private BundleableUtil() {
    }

    public static <T extends Bundleable> d31 fromBundleList(Bundleable.Creator<T> creator, List<Bundle> list) {
        y21 y21VarX = d31.x();
        for (int i = 0; i < list.size(); i++) {
            y21VarX.a(creator.fromBundle((Bundle) Assertions.checkNotNull(list.get(i))));
        }
        return y21VarX.g();
    }

    public static <T extends Bundleable> d31 toBundleList(List<T> list) {
        y21 y21VarX = d31.x();
        for (int i = 0; i < list.size(); i++) {
            y21VarX.a(list.get(i).toBundle());
        }
        return y21VarX.g();
    }
}
