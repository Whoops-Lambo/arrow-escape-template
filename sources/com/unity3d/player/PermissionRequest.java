package com.unity3d.player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class PermissionRequest {
    static final int DENIED = 2;
    static final int DENIED_DONT_ASK_AGAIN = 3;
    static final int GRANTED = 1;
    private IPermissionRequestCallbacks mCallbacks;
    private String[] mPermissionNames;

    public String[] getPermissionNames() {
        return this.mPermissionNames;
    }

    public void permissionResponse(String[] strArr, int[] iArr) {
        IPermissionRequestCallbacks iPermissionRequestCallbacks = this.mCallbacks;
        if (iPermissionRequestCallbacks == null) {
            return;
        }
        iPermissionRequestCallbacks.onPermissionResult(strArr, iArr);
    }

    public PermissionRequest(String[] strArr, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        this.mPermissionNames = strArr;
        this.mCallbacks = iPermissionRequestCallbacks;
    }
}
