package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter F;
    public Spinner G;
    public final AdapterView.OnItemSelectedListener H;

    @Override // androidx.preference.Preference
    public final void f(PreferenceViewHolder preferenceViewHolder) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) preferenceViewHolder.itemView.findViewById(com.ecffri.arrows.R.id.spinner);
        this.G = spinner;
        spinner.setAdapter((SpinnerAdapter) this.F);
        this.G.setOnItemSelectedListener(this.H);
        Spinner spinner2 = this.G;
        String str = this.C;
        if (str == null || (charSequenceArr = this.B) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!charSequenceArr[length].equals(str)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.f(preferenceViewHolder);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void g() {
        this.G.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ecffri.arrows.R.attr.dropdownPreferenceStyle);
        this.H = new AdapterView.OnItemSelectedListener() { // from class: androidx.preference.DropDownPreference.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
                if (i >= 0) {
                    DropDownPreference dropDownPreference = DropDownPreference.this;
                    String string = dropDownPreference.B[i].toString();
                    if (string.equals(dropDownPreference.C)) {
                        return;
                    }
                    dropDownPreference.n(string);
                }
            }
        };
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.F = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.A;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void d() {
        super.d();
        ArrayAdapter arrayAdapter = this.F;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
