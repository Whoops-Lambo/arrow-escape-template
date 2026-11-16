package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment {
    public final HashSet i = new HashSet();
    public boolean j;
    public CharSequence[] k;
    public CharSequence[] l;

    @Override // androidx.preference.PreferenceDialogFragment
    public final void d(AlertDialog.Builder builder) {
        int length = this.l.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.i.contains(this.l[i].toString());
        }
        builder.setMultiChoiceItems(this.k, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = MultiSelectListPreferenceDialogFragment.this;
                HashSet hashSet = multiSelectListPreferenceDialogFragment.i;
                boolean z2 = multiSelectListPreferenceDialogFragment.j;
                if (z) {
                    multiSelectListPreferenceDialogFragment.j = hashSet.add(multiSelectListPreferenceDialogFragment.l[i2].toString()) | z2;
                } else {
                    multiSelectListPreferenceDialogFragment.j = hashSet.remove(multiSelectListPreferenceDialogFragment.l[i2].toString()) | z2;
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public final void c(boolean z) {
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a();
        if (z && this.j) {
            multiSelectListPreference.getClass();
            HashSet hashSet = multiSelectListPreference.A;
            hashSet.clear();
            hashSet.addAll(this.i);
            multiSelectListPreference.d();
        }
        this.j = false;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.i;
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
        this.j = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
        this.k = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
        this.l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.i));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.j);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.l);
    }
}
