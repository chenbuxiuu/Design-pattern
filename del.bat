@echo off  
rem ��������...  
rem for /f "delims=" %%i in ('dir /b /a-d /s "*.class"') do echo %%i  
rem �������  
rem ɾ��
for /f "delims=" %%i in ('dir /b /a-d /s "*.class"') do del  "%%i" 
rem ɾ�����