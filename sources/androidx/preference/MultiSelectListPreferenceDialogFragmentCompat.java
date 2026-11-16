package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public final HashSet i = new HashSet();
    public boolean j;
    public CharSequence[] k;
    public CharSequence[] l;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void f(boolean z) {
        if (z && this.j) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) d();
            multiSelectListPreference.getClass();
            HashSet hashSet = multiSelectListPreference.A;
            hashSet.clear();
            hashSet.addAll(this.i);
            multiSelectListPreference.d();
        }
        this.j = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public final void g(AlertDialog.Builder builder) {
        int length = this.l.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.i.contains(this.l[i].toString());
        }
        CharSequence[] charSequenceArr = this.k;
        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                HashSet hashSet = multiSelectListPreferenceDialogFragmentCompat.i;
                boolean z2 = multiSelectListPreferenceDialogFragmentCompat.j;
                if (z) {
                    multiSelectListPreferenceDialogFragmentCompat.j = hashSet.add(multiSelectListPreferenceDialogFragmentCompat.l[i2].toString()) | z2;
                } else {
                    multiSelectListPreferenceDialogFragmentCompat.j = hashSet.remove(multiSelectListPreferenceDialogFragmentCompat.l[i2].toString()) | z2;
                }
            }
        };
        AlertController.AlertParams alertParams = builder.a;
        alertParams.n = charSequenceArr;
        alertParams.v = onMultiChoiceClickListener;
        alertParams.r = zArr;
        alertParams.s = true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.i;
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.j = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.k = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.i));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.j);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.l);
    }
}
