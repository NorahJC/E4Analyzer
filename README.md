# E4 Analyzer

## Introduction

- As part of research under an NSF grant, I was tasked with creating a comprehensive development tool to assist requirements analysts during elicitation interviews
- The NCUR poster reflects the accepted [abstract][5] and will be presented at the National Conference on Undergraduate Research (NCUR) under the title "Developing Comprehensive Tool To Support Requirements Analyst During Elicitation Interviews"
- Because Bluetooth connectivity is not stable on the current Android mobile device, synchronization has not yet been accomplished and nor has the real-time graphs
- Recording visualizations and app user-friendliness design are in the works

## Setup

- Cloned [EmpaLink Sample Project][4] repository
- Went to [Empatica Connect][1] to retrieve the API key for the E4 wristband and Android SDK for the .aar file
- Assigned the  API key in `MainActivity` and pasted the .aar file into the `libs` folder
- Went to [GraphView][3] and added the dependency to the project's build.gradle under the app folder
- Built the project 
- Mobile device must enable Bluetooth

For more information about the Empatica API for Android, please check their [official documentation][2].

[1]: https://www.empatica.com/connect/developer.php
[2]: http://developer.empatica.com
[3]: http://www.android-graphview.org/download-getting-started/
[4]: https://github.com/empatica/empalink-sample-project-android
[5]: https://apps.cur.org/ncur2019/search/List_NCUR.aspx?keyword=&presentername=Norah&presentationtype=&subject=&institution=
