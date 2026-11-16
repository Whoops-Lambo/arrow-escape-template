package com.unity3d.player;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class P extends AccessibilityNodeProvider {
    public final /* synthetic */ UnityAccessibilityDelegate a;

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        if (i != -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            if (UnityAccessibilityDelegate.populateNodeInfo(accessibilityNodeInfoObtain, i, this.a.b)) {
                return accessibilityNodeInfoObtain;
            }
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(this.a.b);
        Object parent = this.a.b.getParent();
        if (parent instanceof View) {
            accessibilityNodeInfoObtain2.setParent((View) parent);
        }
        int[] rootNodeIds = UnityAccessibilityDelegate.getRootNodeIds();
        if (rootNodeIds != null) {
            for (int i2 : rootNodeIds) {
                accessibilityNodeInfoObtain2.addChild(this.a.b, i2);
            }
        }
        return accessibilityNodeInfoObtain2;
    }

    public P(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.a = unityAccessibilityDelegate;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        if (i2 == 64) {
            return this.a.sendEventForVirtualViewId(i, 32768);
        }
        if (i2 == 128) {
            return this.a.sendEventForVirtualViewId(i, 65536);
        }
        if (i2 == 16 || i2 == 262144 || i2 == 524288) {
            if (!UnityAccessibilityDelegate.isNodeInvokable(i)) {
                return false;
            }
            UnityPlayer unityPlayer = this.a.a;
            Objects.requireNonNull(unityPlayer);
            this.a.a.invokeOnMainThread((Runnable) new L(this, unityPlayer, i));
            return true;
        }
        if (i2 == 4096 || i2 == 8192) {
            if (UnityAccessibilityDelegate.isNodeSlider(i)) {
                UnityPlayer unityPlayer2 = this.a.a;
                Objects.requireNonNull(unityPlayer2);
                this.a.a.invokeOnMainThread((Runnable) new M(this, unityPlayer2, i2, i));
                return true;
            }
            if (UnityAccessibilityDelegate.isNodeScrollable(i)) {
                UnityPlayer unityPlayer3 = this.a.a;
                Objects.requireNonNull(unityPlayer3);
                this.a.a.invokeOnMainThread((Runnable) new N(unityPlayer3, i, i2));
                return true;
            }
        }
        if (i2 != 1048576 || !UnityAccessibilityDelegate.isNodeDismissable(i)) {
            return false;
        }
        UnityPlayer unityPlayer4 = this.a.a;
        Objects.requireNonNull(unityPlayer4);
        this.a.a.invokeOnMainThread((Runnable) new O(unityPlayer4, i));
        return true;
    }
}
