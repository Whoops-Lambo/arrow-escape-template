package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends Fragment {
    private static final String b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";
    private InterfaceC1371a a;

    /* JADX INFO: renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC1371a {
        void a(Activity activity);

        void b(Activity activity);

        void c(Activity activity);
    }

    private void c(InterfaceC1371a interfaceC1371a) {
        if (interfaceC1371a != null) {
            interfaceC1371a.b(getActivity());
        }
    }

    public void d(InterfaceC1371a interfaceC1371a) {
        this.a = interfaceC1371a;
    }

    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(b);
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager != null && fragmentManager.findFragmentByTag(b) == null) {
            fragmentManager.beginTransaction().add(new a(), b).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC1371a interfaceC1371a) {
        if (interfaceC1371a != null) {
            interfaceC1371a.c(getActivity());
        }
    }

    private void b(InterfaceC1371a interfaceC1371a) {
        if (interfaceC1371a != null) {
            interfaceC1371a.a(getActivity());
        }
    }
}
