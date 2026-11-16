package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class ListPreferenceDialogFragment extends PreferenceDialogFragment {
    public int i;
    public CharSequence[] j;
    public CharSequence[] k;

    @Override // androidx.preference.PreferenceDialogFragment
    public final void d(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.j, this.i, new DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ListPreferenceDialogFragment listPreferenceDialogFragment = ListPreferenceDialogFragment.this;
                listPreferenceDialogFragment.i = i;
                listPreferenceDialogFragment.h = -1;
                dialogInterface.dismiss();
            }
        });
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public final void c(boolean z) {
        int i;
        ListPreference listPreference = (ListPreference) a();
        if (z && (i = this.i) >= 0) {
            String string = this.k[i].toString();
            listPreference.getClass();
            listPreference.n(string);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) a();
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

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.k);
    }
}
