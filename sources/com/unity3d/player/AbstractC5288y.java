package com.unity3d.player;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import defpackage.jg3;

/* JADX INFO: renamed from: com.unity3d.player.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC5288y implements TextWatcher, jg3 {
    public final Context a;
    public final UnityPlayerForActivityOrService b;
    public final EditText c = createEditText(this);
    public boolean d;
    public boolean e;
    public P0 f;
    public C5281u0 g;

    public abstract /* synthetic */ void a();

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public abstract EditText createEditText(AbstractC5288y abstractC5288y);

    public abstract /* synthetic */ void hide();

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public abstract void setHideInputField(boolean z);

    public final void a(String str, boolean z) {
        this.c.setSelection(0, 0);
        this.b.reportSoftInputStr(str, 1, z);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.reportSoftInputStr(editable.toString(), 0, false);
        int selectionStart = this.c.getSelectionStart();
        this.b.reportSoftInputSelection(selectionStart, this.c.getSelectionEnd() - selectionStart);
    }

    public final String b() {
        EditText editText = this.c;
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    public final void c() {
        ((InputMethodManager) this.a.getSystemService(InputMethodManager.class)).showSoftInput(this.c, 0);
    }

    public void invokeOnClose() {
        C5281u0 c5281u0 = this.g;
        if (c5281u0 != null) {
            RunnableC5283v0 runnableC5283v0 = c5281u0.a;
            runnableC5283v0.a = true;
            if (runnableC5283v0.b) {
                runnableC5283v0.c.release();
            }
        }
    }

    public boolean isConsumeOutsideTouchesEnabled() {
        return this.e;
    }

    @Override // defpackage.jg3
    public final void setCharacterLimit(int i) {
        EditText editText = this.c;
        if (editText != null) {
            if (i > 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            } else {
                editText.setFilters(new InputFilter[0]);
            }
        }
    }

    @Override // defpackage.jg3
    public final void setSelection(int i, int i2) {
        int i3;
        EditText editText = this.c;
        if (editText == null || editText.getText().length() < (i3 = i2 + i)) {
            return;
        }
        this.c.setSelection(i, i3);
    }

    @Override // defpackage.jg3
    public final void setText(String str) {
        EditText editText = this.c;
        if (editText == null || TextUtils.equals(str, editText.getText())) {
            return;
        }
        int selectionStart = this.c.getSelectionStart();
        int selectionEnd = this.c.getSelectionEnd();
        this.c.removeTextChangedListener(this);
        try {
            Editable text = this.c.getText();
            if ((text == null || BaseInputConnection.getComposingSpanStart(text) == -1) && text != null) {
                int length = text.length();
                if (str == null) {
                    str = "";
                }
                text.replace(0, length, str);
            } else {
                this.c.setText(str);
            }
            this.c.addTextChangedListener(this);
            int length2 = this.c.getText() != null ? this.c.getText().length() : 0;
            if (selectionStart < 0 || selectionEnd < 0) {
                return;
            }
            this.c.setSelection(Math.max(0, Math.min(selectionStart, length2)), Math.max(0, Math.min(selectionEnd, length2)));
        } catch (Throwable th) {
            this.c.addTextChangedListener(this);
            throw th;
        }
    }

    public void setupTextInput(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2) {
        this.c.setOnEditorActionListener(new C5286x(this));
        this.c.setBackgroundColor(-1);
        this.c.setImeOptions(6);
        this.c.setText(str);
        this.c.setHint(str2);
        this.c.setHintTextColor(1627389952);
        EditText editText = this.c;
        int i3 = (z ? 32768 : 524288) | (z2 ? 131072 : 0) | (z3 ? 128 : 0);
        if (i >= 0 && i <= 11) {
            int i4 = new int[]{1, 16385, 12290, 17, 2, 3, 8289, 33, 1, 16417, 17, 8194}[i];
            if ((i4 & 2) != 0) {
                i3 = (z3 ? 16 : 0) | i4;
            } else {
                i3 |= i4;
            }
        }
        editText.setInputType(i3);
        this.c.setImeOptions(33554432);
        if (i2 > 0) {
            this.c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
        }
        this.c.addTextChangedListener(this);
        EditText editText2 = this.c;
        editText2.setSelection(editText2.getText().length());
        this.c.setClickable(true);
    }

    public AbstractC5288y(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = context;
        this.b = unityPlayerForActivityOrService;
    }

    public void a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        this.e = z6;
        setupTextInput(str, i, z, z2, z3, z4, str2, i2);
        setHideInputField(z5);
    }

    @Override // defpackage.jg3
    public final void a(P0 p0) {
        this.f = p0;
    }

    @Override // defpackage.jg3
    public final void a(C5281u0 c5281u0) {
        this.g = c5281u0;
    }
}
