package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class e implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int iB;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iA = iVersions.a(context, str);
        selectionResult.a = iA;
        int i = 1;
        int i2 = 0;
        if (iA != 0) {
            iB = iVersions.b(context, str, false);
            selectionResult.b = iB;
        } else {
            iB = iVersions.b(context, str, true);
            selectionResult.b = iB;
        }
        int i3 = selectionResult.a;
        if (i3 == 0) {
            if (iB == 0) {
                i = 0;
            }
            selectionResult.c = i;
            return selectionResult;
        }
        i2 = i3;
        if (i2 >= iB) {
            i = -1;
        }
        selectionResult.c = i;
        return selectionResult;
    }
}
