@echo off  
rem 正在搜索...  
rem for /f "delims=" %%i in ('dir /b /a-d /s "*.class"') do echo %%i  
rem 搜索完毕  
rem 删除
for /f "delims=" %%i in ('dir /b /a-d /s "*.class"') do del  "%%i" 
rem 删除完成