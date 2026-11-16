package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iB = iVersions.b(context, str, true);
        selectionResult.b = iB;
        if (iB != 0) {
            selectionResult.c = 1;
            return selectionResult;
        }
        int iA = iVersions.a(context, str);
        selectionResult.a = iA;
        if (iA != 0) {
            selectionResult.c = -1;
        }
        return selectionResult;
    }
}
