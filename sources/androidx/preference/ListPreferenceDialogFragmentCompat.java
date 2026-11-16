package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public int i;
    public CharSequence[] j;
    public CharSequence[] k;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void f(boolean z) {
        int i;
        if (!z || (i = this.i) < 0) {
            return;
        }
        String string = this.k[i].toString();
        ListPreference listPreference = (ListPreference) d();
        listPreference.getClass();
        listPreference.n(string);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void g(AlertDialog.Builder builder) {
        CharSequence[] charSequenceArr = this.j;
        int i = this.i;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
                listPreferenceDialogFragmentCompat.i = i2;
                listPreferenceDialogFragmentCompat.h = -1;
                dialogInterface.dismiss();
            }
        };
        AlertController.AlertParams alertParams = builder.a;
        alertParams.n = charSequenceArr;
        alertParams.p = onClickListener;
        alertParams.u = i;
        alertParams.t = true;
        alertParams.g = null;
        alertParams.h = null;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) d();
            CharSequence[] charSequenceArr = listPreference.A;
            CharSequence[] charSequenceArr2 = listPreference.B;
            if (charSequenceArr != null && charSequenceArr2 != null) {
                this.i = listPreference.m(listPreference.C);
                this.j = listPreference.A;
                this.k = charSequenceArr2;
                return;
            }
            e32.i("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.i = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.j = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.k);
    }
}
