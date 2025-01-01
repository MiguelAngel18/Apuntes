let popupWindow;

function openWindowOnce()
{
    if (!popupWindow || popupWindow.closed)
    {
        popupWindow = window.open('opener.html');
    }
}

function openWindowMultiple()
{
    window.open('opener.html');
}

function openWindowWithFeatures()
{
    window.open('opener.html', '', 'width=420,height=430,status=yes,resizable=yes');
}

function openWindowWithMoreFeatures()
{
    window.open('opener.html', '', 'width=600,height=300,left=150,menubar=no,status=no,scrollbars=no,directories=no,location=no,toolbar=no,titlebar=no');
}

function openFullScreenWindow()
{
    window.open('opener.html', '', 'fullscreen=yes');
}

function closeWindows()
{
    if (popupWindow && !popupWindow.closed)
    {
        popupWindow.close();
    }
}
