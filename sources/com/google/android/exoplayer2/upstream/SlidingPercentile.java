package com.google.android.exoplayer2.upstream;

import defpackage.nj;
import defpackage.pg2;
import defpackage.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<pg2> INDEX_COMPARATOR = new x(23);
    private static final Comparator<pg2> VALUE_COMPARATOR = new x(24);
    private final pg2[] recycledSamples = new pg2[5];
    private final ArrayList<pg2> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(pg2 pg2Var, pg2 pg2Var2) {
        return pg2Var.a - pg2Var2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(pg2 pg2Var, pg2 pg2Var2) {
        return Float.compare(pg2Var.c, pg2Var2.c);
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }

    public SlidingPercentile(int i) {
        this.maxWeight = i;
    }

    public void addSample(int i, float f) {
        pg2 pg2Var;
        ensureSortedByIndex();
        int i2 = this.recycledSampleCount;
        if (i2 > 0) {
            pg2[] pg2VarArr = this.recycledSamples;
            int i3 = i2 - 1;
            this.recycledSampleCount = i3;
            pg2Var = pg2VarArr[i3];
        } else {
            pg2Var = new pg2();
        }
        int i4 = this.nextSampleIndex;
        this.nextSampleIndex = i4 + 1;
        pg2Var.a = i4;
        pg2Var.b = i;
        pg2Var.c = f;
        this.samples.add(pg2Var);
        this.totalWeight += i;
        while (true) {
            int i5 = this.totalWeight;
            int i6 = this.maxWeight;
            if (i5 > i6) {
                int i7 = i5 - i6;
                pg2 pg2Var2 = this.samples.get(0);
                int i8 = pg2Var2.b;
                if (i8 <= i7) {
                    this.totalWeight -= i8;
                    this.samples.remove(0);
                    int i9 = this.recycledSampleCount;
                    if (i9 < 5) {
                        pg2[] pg2VarArr2 = this.recycledSamples;
                        this.recycledSampleCount = i9 + 1;
                        pg2VarArr2[i9] = pg2Var2;
                    }
                } else {
                    pg2Var2.b = i8 - i7;
                    this.totalWeight -= i7;
                }
            } else {
                return;
            }
        }
    }

    public float getPercentile(float f) {
        ensureSortedByValue();
        float f2 = f * this.totalWeight;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = this.samples.size();
            ArrayList<pg2> arrayList = this.samples;
            if (i < size) {
                pg2 pg2Var = arrayList.get(i);
                i2 += pg2Var.b;
                if (i2 >= f2) {
                    return pg2Var.c;
                }
                i++;
            } else {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((pg2) nj.h(1, this.samples)).c;
            }
        }
    }
}
