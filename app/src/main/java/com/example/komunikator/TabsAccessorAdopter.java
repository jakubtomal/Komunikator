package com.example.komunikator;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAccessorAdopter extends FragmentPagerAdapter
{
    public TabsAccessorAdopter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case  0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return  chatsFragment;

            case  1:
                ContactsFragment contactsFragment = new ContactsFragment();
                return  contactsFragment;

            case  2:
                GroupsFragment groupsFragment = new GroupsFragment();
                return  groupsFragment;

            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case  0:
                return "Czat";

            case  1:
                return "Kontakty";

            case  2:
                return "Grupy";

            default:
                return null;
        }
    }
}
