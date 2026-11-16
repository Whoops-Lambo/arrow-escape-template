package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
@SuppressLint({"NewApi"})
public final class FragmentWrapper extends IFragmentWrapper.Stub {
    public final Fragment a;

    public static void safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(Fragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Fragment_startActivity_8f6fc823412b34e0e98859b54c6fab97(Fragment p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Fragment;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void P1(boolean z) {
        this.a.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void a3(int i, Intent intent) {
        safedk_Fragment_startActivityForResult_217cff818a3a1b3aacc309b44c0675e4(this.a, intent, i);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void z3(Intent intent) {
        safedk_Fragment_startActivity_8f6fc823412b34e0e98859b54c6fab97(this.a, intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzb() {
        return new ObjectWrapper(this.a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzc() {
        return this.a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzd() {
        return this.a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        Fragment parentFragment = this.a.getParentFragment();
        if (parentFragment != null) {
            return new FragmentWrapper(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzf() {
        return new ObjectWrapper(this.a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzg() {
        return this.a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzh() {
        return this.a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzi() {
        Fragment targetFragment = this.a.getTargetFragment();
        if (targetFragment != null) {
            return new FragmentWrapper(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzj() {
        return this.a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzk() {
        return this.a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzl() {
        return new ObjectWrapper(this.a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzm() {
        return this.a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzn() {
        return this.a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzo() {
        return this.a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzp() {
        return this.a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzq() {
        return this.a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzr() {
        return this.a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzu(boolean z) {
        this.a.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzw(boolean z) {
        this.a.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzx(boolean z) {
        this.a.setUserVisibleHint(z);
    }

    public FragmentWrapper(Fragment fragment) {
        this.a = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void g(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.z1(iObjectWrapper);
        Preconditions.checkNotNull(view);
        this.a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void v0(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.z1(iObjectWrapper);
        Preconditions.checkNotNull(view);
        this.a.unregisterForContextMenu(view);
    }
}
