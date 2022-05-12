if (shift == 0)
    {
        cout << s << endl;
        return 1;
    }
    else
    {
        if (shift >= 1) // rshift
        {
            s = s.substr(0, abs(shift)) + s.substr(abs(shift));
        }
        else
        {
            s = s.substr(shift) + s.substr(0, shift);
        }

        cout << s << endl;
        return 1;
    }