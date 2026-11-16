package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class FilterWord {
    private String ahm;
    private String kgy;
    private boolean rz;
    private List<FilterWord> uq;

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.uq == null) {
            this.uq = new ArrayList();
        }
        this.uq.add(filterWord);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }

    public String getId() {
        return this.kgy;
    }

    public boolean getIsSelected() {
        return this.rz;
    }

    public String getName() {
        return this.ahm;
    }

    public List<FilterWord> getOptions() {
        return this.uq;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.uq;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.kgy) || TextUtils.isEmpty(this.ahm)) ? false : true;
    }

    public void setId(String str) {
        this.kgy = str;
    }

    public void setIsSelected(boolean z) {
        this.rz = z;
    }

    public void setName(String str) {
        this.ahm = str;
    }

    public FilterWord(String str, String str2) {
        this.kgy = str;
        this.ahm = str2;
    }

    public FilterWord() {
    }
}
