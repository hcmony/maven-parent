#!/bin/bash
pid=`ps aux|grep ${jar.name}|grep -v grep |awk '{print $2}'`
if [ -n "${pid}" ]; then
  kill ${pid}
  echo `ps aux|grep ${jar.name}|grep -v grep`
else
  echo "WARNING: ${jar.name} does not started!"
fi